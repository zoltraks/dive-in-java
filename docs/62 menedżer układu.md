Menedżer układu
===============

Dodając kolejne elementy do komponentów, należy określić sposób w jaki elementy będą ułożone wewnątrz komponentu.

Na poziomie komponentu kontenera należy więc określić klasę menedżera układu, co pozwala na określenie sposobu pozycjonowania komponentów należących do kontenera.

https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

W przypadku tworzenia okien przy użyciu projektanta, menedżer układu ustawia się jako właściwość komponentu **Layout Manager**.

![](image/shot/shot-1055.png)

W przypadku okien tworzonych bez użycia kreatora, należy posłużyć się metodą ``setLayout``.

```java
panelMain.setLayout(new BorderLayout());
```

Można używać różnych układów w różnych kontenerach, np. na poziomie głównego kontenera można zdecydować się na układ **BorderLayout**, zaś w kontenerze zajmującym centralną część użyć układu **FlowLayout**, itd.

Dodając komponenty do kontenera o określonym menedżerze układu, należy użyć metody ``add`` przyjmującej jako drugi argument obiekt reprezentujący ograniczenie układu.

```java
// przykład dla BorderLayout
panelMain.add(labelText, BorderLayout.CENTER);
```

```java
// przykład dla FlowLayout
panelMain.add(buttonClose, FlowLayout.TRAILING);
```

Jeśli nie zostanie zdefiniowany menedżer układu, domyślnie użytym będzie **FlowLayout**.

### FlowLayout

![](image/shot/shot-1124.png)

```java
public class MainFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JTextField text1;
    private JTextField text2;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public MainFrame() {
        super();
        setPreferredSize(new Dimension(300, 200));
        JPanel content = new JPanel(new FlowLayout());

        label1 = new JLabel("Label 1");
        label1.setPreferredSize(new Dimension(100, 20));

        text1 = new JTextField();
        text1.setPreferredSize(new Dimension(170, 30));
        text1.setBackground(new Color(180, 190, 240));

        label2 = new JLabel("Label 2");
        label2.setPreferredSize(new Dimension(80, 30));

        text2 = new JTextField();
        text2.setPreferredSize(new Dimension(130, 20));
        text2.setBackground(new Color(240, 190, 180));

        button1 = new JButton("Button 1");
        button1.setPreferredSize(new Dimension(80, 20));
        button1.setBackground(new Color(210, 190, 230));

        button2 = new JButton("Button 2");
        button2.setPreferredSize(new Dimension(120, 30));
        button2.setBackground(new Color(190, 240, 210));

        button3 = new JButton("Button 3");
        button3.setPreferredSize(new Dimension(100, 40));

        content.add(label1);
        content.add(text1);
        content.add(label2);
        content.add(text2);
        content.add(button1);
        content.add(button2);
        content.add(button3);

        setContentPane(content);
        pack();
    }

}
```

Przykład z użyciem komponentu użytkownika i zmianą rozmiaru okna.

```java
public class Component extends JPanel {

    private JLabel label;
    private JTextField text;

    public Component(String caption) {
        setLayout(new BorderLayout());
        label = new JLabel(caption);
        label.setPreferredSize(new Dimension(80, 20));
        text = new JTextField();
        text.setPreferredSize(new Dimension(200, 20));
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
        JPanel content = new JPanel(new FlowLayout());
        Component c1 = new Component("Caption 1");
        content.add(c1);
        Component c2 = new Component("Caption 2");
        content.add(c2);
        Component c3 = new Component("Caption 3");
        content.add(c3);
        Component c4 = new Component("Caption 4");
        content.add(c4);
        setContentPane(content);
        pack();
    }

}
```

```java
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }

        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
```

![](image/shot/shot-1121.png)

![](image/shot/shot-1122.png)

![](image/shot/shot-1123.png)

### BorderLayout

![](image/shot/shot-3011.png)

```java
public class MainFrame extends JFrame {
    private JPanel panelContent;
    private JButton buttonPageStart;
    private JButton buttonPageEnd;
    private JButton buttonLineStart;
    private JButton buttonCenter;
    private JButton buttonLineEnd;

    public MainFrame() {
        super();

        this.panelContent = new JPanel();
        this.panelContent.setLayout(new BorderLayout());

        this.buttonPageStart = new JButton();
        this.buttonPageStart.setText("PAGE_START");
        this.buttonPageStart.setPreferredSize(new Dimension(0, 50));
        this.panelContent.add(this.buttonPageStart, BorderLayout.PAGE_START);

        this.buttonPageEnd = new JButton();
        this.buttonPageEnd.setText("PAGE_END");
        this.buttonPageEnd.setPreferredSize(new Dimension(0, 50));
        this.panelContent.add(this.buttonPageEnd, BorderLayout.PAGE_END);

        this.buttonLineStart = new JButton();
        this.buttonLineStart.setText("LINE_START");
        this.buttonLineStart.setPreferredSize(new Dimension(150, 0));
        this.panelContent.add(this.buttonLineStart, BorderLayout.LINE_START);

        this.buttonCenter = new JButton();
        this.buttonCenter.setText("CENTER");
        this.panelContent.add(this.buttonCenter, BorderLayout.CENTER);

        this.buttonLineEnd = new JButton();
        this.buttonLineEnd.setText("LINE_END");
        this.buttonLineEnd.setPreferredSize(new Dimension(150, 0));
        this.panelContent.add(this.buttonLineEnd, BorderLayout.LINE_END);

        this.setContentPane(panelContent);
        this.setMinimumSize(new Dimension(500, 500));
        this.pack();

        this.buttonCenter.requestFocusInWindow();
    }
}
```

### BoxLayout

![](image/shot/shot-3012.png)

```java
public class MainFrame extends JFrame {
    private JPanel panelContent;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public MainFrame() {
        super();

        this.panelContent = new JPanel();
        this.panelContent.setLayout(new BoxLayout(this.panelContent, BoxLayout.Y_AXIS));

        this.button1 = new JButton();
        this.button1.setText("1");
        this.button1.setMinimumSize(new Dimension(100, 50));
        this.button1.setPreferredSize(new Dimension(100, 50));
        this.button1.setMaximumSize(new Dimension(100, 50));
        this.button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.panelContent.add(this.button1);

        this.button2 = new JButton();
        this.button2.setText("2");
        this.button2.setMinimumSize(new Dimension(100, 50));
        this.button2.setPreferredSize(new Dimension(100, 50));
        this.button2.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        this.button2.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.panelContent.add(this.button2);

        this.button3 = new JButton();
        this.button3.setText("3");
        this.button3.setMinimumSize(new Dimension(100, 50));
        this.button3.setPreferredSize(new Dimension(100, 50));
        this.button3.setMaximumSize(new Dimension(100, 50));
        this.button3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        this.panelContent.add(this.button3);

        this.setContentPane(panelContent);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
    }
}
```

![](image/shot/shot-3013.png)

```java
public class MainFrame extends JFrame {
    private JPanel panelContent;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public MainFrame() {
        super();

        this.panelContent = new JPanel();
        this.panelContent.setLayout(new BoxLayout(this.panelContent, BoxLayout.X_AXIS));

        this.button1 = new JButton();
        this.button1.setText("1");
        this.button1.setMinimumSize(new Dimension(100, 50));
        this.button1.setPreferredSize(new Dimension(100, 50));
        this.button1.setMaximumSize(new Dimension(100, 50));
        this.button1.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.panelContent.add(this.button1);

        this.button2 = new JButton();
        this.button2.setText("2");
        this.button2.setMinimumSize(new Dimension(100, 50));
        this.button2.setPreferredSize(new Dimension(100, 50));
        this.button2.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        this.button2.setAlignmentY(Component.TOP_ALIGNMENT);
        this.panelContent.add(this.button2);

        this.button3 = new JButton();
        this.button3.setText("3");
        this.button3.setMinimumSize(new Dimension(100, 50));
        this.button3.setPreferredSize(new Dimension(100, 50));
        this.button3.setMaximumSize(new Dimension(100, 50));
        this.button3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        this.panelContent.add(this.button3);

        this.setContentPane(panelContent);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
    }
}
```

### GridLayout

![](image/shot/shot-1049.png)

Prosty menedżer układu siatki z określoną ilością kolumn i wierszy równomiernie rozłożonych.

```java
public class MainFrame extends JFrame {

    public MainFrame() {
        super();
        setPreferredSize(new Dimension(300, 200));
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(3, 2));
        JLabel l1 = new JLabel("Label 1");
        contentPanel.add(l1);
        JLabel l2 = new JLabel("Label 2");
        contentPanel.add(l2);
        JLabel l3 = new JLabel("Label 3");
        contentPanel.add(l3);
        JLabel l4 = new JLabel("Label 4");
        contentPanel.add(l4);
        JLabel l5 = new JLabel("Label 5");
        contentPanel.add(l5);
        JLabel l6 = new JLabel("Label 6");
        contentPanel.add(l6);
        setContentPane(contentPanel);
        pack();
    }

}
```

### GridBagLayout

![](image/shot/shot-3014.png)

```java
public class MainFrame extends JFrame {
    private JPanel panelContent;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public MainFrame() {
        super();

        this.panelContent = new JPanel();
        this.panelContent.setLayout(new GridBagLayout());

        GridBagConstraints constraints;

        this.button1 = new JButton("1");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.panelContent.add(this.button1, constraints);

        this.button2 = new JButton("2");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 1;
        constraints.gridy = 0;
        this.panelContent.add(this.button2, constraints);

        this.button3 = new JButton("3");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 2;
        constraints.gridy = 0;
        this.panelContent.add(this.button3, constraints);

        this.button4 = new JButton("4");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.ipady = 40;
        this.panelContent.add(this.button4, constraints);

        this.button5 = new JButton("5");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 2;
        this.panelContent.add(this.button5, constraints);

        this.setContentPane(panelContent);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
    }
}
```
