import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> albumNameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TableColumn<Album, Integer> rentedColumn; 

    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        tableView.setItems(albumList);
    }

    @FXML
    private void handleAdd() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            albumList.add(new Album(albumName, artist, total, available));
            showAlert("Success", "Album added successfully!");
        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid data entered. Please check your inputs.");
        }
    }

    @FXML
    private void handleDelete() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert("Success", "Album deleted successfully!");
        } else {
            showAlert("Error", "No album selected.");
        }
    }

    @FXML
    private void handleUpdate() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();
                showAlert("Success", "Album updated successfully!");
            } catch (NumberFormatException e) {
                showAlert("Error", "Invalid data entered. Please check your inputs.");
            }
        } else {
            showAlert("Error", "No album selected.");
        }
    }

    @FXML
    private void handleRent() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                tableView.refresh();
                showAlert("Success", "Album rented successfully!");
            } else {
                showAlert("Error", "No copies available for renting.");
            }
        } else {
            showAlert("Error", "No album selected.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}