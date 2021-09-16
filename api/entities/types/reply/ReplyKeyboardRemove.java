package api.entities.types.reply;

import api.entities.types.ReplyMarkup;

public class ReplyKeyboardRemove extends ReplyMarkup {
    public ReplyKeyboardRemove() {
        this.remove_keyboard = true;
    }
}
