package api.entities.types;

public interface KeyboardInterface {
    /**
     * Add the button to current row
     * @param button Inserted button
     */
    public void addButton(AbstractKeyboardButton button);
    /**
     * Add some buttons to current row
     * @param buttons Inserted buttons
     */
    public void addButtons(AbstractKeyboardButton[] buttons);
    /**
     * Set new buttons to current row
     * @param buttons Inserted buttons
     */
    public void resetButtons(AbstractKeyboardButton[] buttons);
    /**
     * Go to the next row
     */
    public void nextRow();
    /**
     * Go to the prev row
     */
    public void prevRow();
}
