package node;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

public class FunButton extends Button{

    public FunButton() {init();}

    public FunButton(String name) { super(name); init();}

    public void init(){
        this.getStyleClass().add("funButton");
        this.addEventFilter(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            this.setEffect(new DropShadow());
        });
        this.addEventFilter(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            this.setEffect(null);
        });
    }
}
