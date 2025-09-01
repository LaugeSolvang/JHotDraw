package org.jhotdraw.action.edit;

import javax.swing.*;
import java.awt.*;

public class UtilsAction {
    public static JComponent resolveTargetComponent(JComponent target) {
        if (target != null) {
            return target;
        }

        Component focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getPermanentFocusOwner();
        if (focusOwner instanceof JComponent) {
            return (JComponent) focusOwner;
        }

        return null;
    }
}
