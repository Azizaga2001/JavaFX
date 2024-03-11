module AzizagaProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	requires java.base;
	requires java.sql;
	
	opens Main to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
}
