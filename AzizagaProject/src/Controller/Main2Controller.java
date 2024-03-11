package Controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class Main2Controller extends Application {
 
    @Override public void start(Stage stage) {
        final NumberAxis xAxis = new NumberAxis(1, 31, 1);
        final NumberAxis yAxis = new NumberAxis();
        final AreaChart<Number,Number> ac = 
            new AreaChart<Number,Number>(xAxis,yAxis);
 
        XYChart.Series seriesApril= new XYChart.Series();
        seriesApril.setName("April");
        seriesApril.getData().add(new XYChart.Data(1, 4));
        seriesApril.getData().add(new XYChart.Data(3, 10));
        seriesApril.getData().add(new XYChart.Data(6, 15));
        seriesApril.getData().add(new XYChart.Data(9, 8));
        seriesApril.getData().add(new XYChart.Data(12, 5));
        seriesApril.getData().add(new XYChart.Data(15, 18));
        seriesApril.getData().add(new XYChart.Data(18, 15));
        seriesApril.getData().add(new XYChart.Data(21, 13));
        seriesApril.getData().add(new XYChart.Data(24, 19));
        seriesApril.getData().add(new XYChart.Data(27, 21));
        seriesApril.getData().add(new XYChart.Data(30, 2));
        
        XYChart.Series seriesMay = new XYChart.Series();
        seriesMay.setName("May");
        seriesMay.getData().add(new XYChart.Data(1, 2));
        seriesMay.getData().add(new XYChart.Data(3, 4));
        seriesMay.getData().add(new XYChart.Data(5, 6));
        seriesMay.getData().add(new XYChart.Data(7, 8));
        seriesMay.getData().add(new XYChart.Data(9, 10));
        seriesMay.getData().add(new XYChart.Data(11, 12));
        seriesMay.getData().add(new XYChart.Data(13, 14));
        seriesMay.getData().add(new XYChart.Data(15, 16));
        seriesMay.getData().add(new XYChart.Data(17, 18));
        seriesMay.getData().add(new XYChart.Data(19, 20));
        seriesMay.getData().add(new XYChart.Data(21, 23));
        Scene scene  = new Scene(ac,800,600);
        ac.getData().addAll(seriesApril, seriesMay);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}