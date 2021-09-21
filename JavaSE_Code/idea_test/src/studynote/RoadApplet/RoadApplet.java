package studynote.RoadApplet;

import javax.swing.*;
import java.awt.*;

public class RoadApplet extends JFrame
{
    private RoadComponent roadComponent;
    private JSlider slowdown;
    private JSlider arrival;

    public void init(){
        EventQueue.invokeLater(() -> {
            roadComponent = new RoadComponent();
            slowdown = new JSlider(0, 100, 10);
            arrival = new JSlider(0, 100, 10);

            JPanel p = new JPanel();
            p.setLayout(new GridLayout(1, 6));
            p.add(new Label("Slowdown"));
            p.add(slowdown);
            p.add(new JLabel(""));
            p.add(new JLabel("Arrival"));
            setLayout(new BorderLayout());
            add(p, BorderLayout.NORTH);
            add(roadComponent, BorderLayout.CENTER);
        });
    }

    public void start(){
        new Thread(() -> {
            for (;;){
                roadComponent.update(
                        0.01 * slowdown.getValue(),
                        0.01 * arrival.getValue()
                );
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}
            }
        }).start();
    }
}
