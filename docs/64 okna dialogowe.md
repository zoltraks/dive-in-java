Okna dialogowe
==============

Okno komunikatu
---------------

Standardowe okna dialogowe komunikatów udostępnia komponent klasy ``JOptionPane``. Należy użyć statycznej metody ``showMessageDialog``.

```java
JOptionPane.showMessageDialog(this,
        "My message\n\nLast line",
        "Some error",
        JOptionPane.ERROR_MESSAGE);
```

https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

Okno wyboru pliku
-----------------

Do wyświetlania okien dialogowych otwarcia lub zapisu pliku należy użyć komponentu klasy ``JFileChooser``.

```java
public class MainFrame extends JFrame {
    private JPanel panelMain;
    private JLabel labelHello;
    private JButton buttonBrowse;
    private JButton buttonClose;

    public MainFrame() {
        super("App");
        this.setContentPane(panelMain);
        this.pack();
        buttonBrowse.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBrowseAction();
            }
        });
    }

    private void buttonBrowseAction() {
        var fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.labelHello.setText("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
}
```

Obiekt komponentu można zapamiętać i przechować w prywatnym polu klasy okna aby przy ponownym otwarciu okna wyboru pliku aplikacja zapamiętała ostatnio używany katalog.

```java
private JFileChooser fileChooser;

private JFileChooser getFileChooser() {
    if (fileChooser == null) {
        this.fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    }
    return fileChooser;
}

private void buttonBrowseAction() {
    var fileChooser = getFileChooser();
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        this.labelHello.setText("Selected file: " + selectedFile.getAbsolutePath());
    }
}
```
