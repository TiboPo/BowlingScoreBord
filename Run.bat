rem @ECHO OFF
rem Pas hieronder het pad aan naar je eigen versie van de Java JDK
set PATH=c:\Program Files\Java\jdk-13.0.1\bin;%PATH%
rem Hieronder hetzelfde, maar nu naar je JAVAFX SDKHIERONDER
set PATH_TO_FX=C:\Program Files\java\javafx-sdk-13.0.1\lib
start javaw --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.fxml -jar PesScoreBord\dist\Bowlingscorebord.jar"
rem pause