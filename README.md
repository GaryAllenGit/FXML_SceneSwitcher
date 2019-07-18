Java fxml demo to show how to change the scene on the primary stage and how to create pop-up Stages AND how to pass data between the controllers for the different windows.

Dr Gary Allen, The University of Huddersfield.

This project was created in IntelliJ using Scene Builder to create the user interfaces.

The "simpleDemo" is very basic.  The main class loads a very simple GUI.  Clicking the buttons either changes the Scene on the "primaryStage", or creates a pop-up window in a new Stage.  To make this a bit more interesting scene changes within the stage involve a randomly selected 'Transition', either rotation, fading, or scaling.  Note that you cannot add these transitions to stages, only to scenes and nodes.

The "complexDemo" is more sophisticated.  The 'top level' GUI can create an input window and an output window.  When the input window is created the main GUI controller passes a reference to itself to the input window controller, so that the input window can then call a method of the parent GUI.  When the output window is created the main GUI controller passes data to the output window controller for display.  The demo therefore shows data being passed "up" from a pop-up to the main GUI, and data being passed "down" from the main GUI to a pop-up.

