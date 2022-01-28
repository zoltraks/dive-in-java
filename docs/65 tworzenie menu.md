Tworzenie menu
==============

Menu aplikacji
--------------

Środowisko **IntelliJ IDEA** w wersji darmowej nie wspiera graficznego tworzenia menu aplikacji. Jest to możliwe jedynie w wersji komercyjnej. Należy utworzyć menu programowo i wykorzystać metodę ``setJMenuBar`` klasy ``JFrame``.

```java
private JMenuBar createMenu() {
   var menuBar = new JMenuBar();
   var menuFile = new JMenu("File");
   var menuFileNew = new JMenuItem("New");
   var menuFileQuit = new JMenuItem("Quit");
   menuFileQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
   var menuHelp = new JMenu("Help");
   var menuHelpAbout = new JMenuItem("About");
   menuHelpAbout.setIcon(null);
   menuFile.add(menuFileNew);
   menuFile.addSeparator();
   menuFile.add(menuFileQuit);
   menuHelp.add(menuHelpAbout);
   menuBar.add(menuFile);
   menuBar.add(menuHelp);
   return menuBar;
}
```

Menu kontekstowe
----------------
