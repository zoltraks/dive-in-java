Tworzenie komponentu
====================

Tworzenie własnego komponentu polega na utworzeniu klasy dziedziczącej po klasie JComponent lub pochodnej.

JComponent
----------

Dziedzicząc po klasie podstawowej ``JComponent`` uzyskujemy pełną kontrolę jak komponent ma się zachowywać.

JPanel
------

Dziedzicząc komponent ``JPanel`` uzyskujemy domyślne rysowanie tła wraz z innymi cechami komponentu.

Przykład
--------

```java
public class Component extends JPanel {

    private JLabel label;
    private JTextField text;

    public Component() {
        setLayout(new BorderLayout());
        label = new JLabel("Label");
        text = new JTextField();
        add(label, BorderLayout.LINE_START);
        add(text, BorderLayout.CENTER);
    }

}
```

```java
public class Frame extends JFrame {

    public Frame() {
        super();
        setPreferredSize(new Dimension(300, 200));
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1));
        Component c1 = new Component();
        contentPanel.add(c1);
        Component c2 = new Component();
        contentPanel.add(c2);
        setContentPane(contentPanel);
        pack();
    }

}
```

```java
public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
```
