
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;

public class PieChart extends JFrame {

    private static final long serialVersionUID = 1L;

    public PieChart() {

        initUI();
    }

    private void initUI() {

        DefaultPieDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("PieChart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private DefaultPieDataset createDataset() {

        DefaultPieDataset dataset = new DefaultPieDataset();

        List<Questions> settings = FileOp.readQuestionFromFile("Settings.ser");

        String name;
        int questionNumber;

        HashMap<String, Integer> forChart = new HashMap<>();

        for (Questions setting : settings) {
            questionNumber = setting.settings[4];
            for (int i = 0; i < setting.highScores.size(); i++) {
                name = setting.highScores.get(i)[0];

                if (!forChart.containsKey(name)) {
                    forChart.put(name, 0);
                }

                forChart.replace(name, forChart.get(name) + questionNumber);
                System.out.println(forChart.toString());
            }

        }

        for (Map.Entry<String, Integer> entry : forChart.entrySet()) {
            String username = entry.getKey();
            Integer number = entry.getValue();
            System.out.println("Anahtar: " + username + ", Deger: " + number);

            dataset.setValue(username, number);

        }

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Child - Solved questions",
                dataset,
                false, true, false);
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({1})"));
        return pieChart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            PieChart ex = new PieChart();
            ex.setVisible(true);
        });
    }
}
