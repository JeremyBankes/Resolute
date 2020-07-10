# Resolute
Strange resolution behavior with libGDX

```java
public class DesktopLauncher {
  
  public static void main (String[] arg) {
    try {
      // On Windows, if your scaling is not 100%, and you do not load this class, scaling will apply to your libGDX application.
      // However if you do load this class, scaling will not apply to the application. This seems behaviour seems arbitrary
      // as one wouldn't think loading an AWT class should have an effect on their libGDX application.
      Class.forName(System.getProperty("java.awt.graphicsenv")); // (sun.awt.Win32GraphicsEnvironment on Windows)
      // This is currently how I disable Windows scaling in my applications. Is there a recognized way to do this from within
      // libGDX? (PS. GraphicsEnvironment.getLocalGraphicsEnvironment() also indirectly loads this class)
      
      // An example project is ready to clone at https://github.com/JeremyBankes/Resolute
    } catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
    
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
    config.width = 160;
    config.height = 120;
    new LwjglApplication(new Resolute(), config);
  }

}
```