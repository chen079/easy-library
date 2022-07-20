package pers.zhangyang.easylibrary.annotation;

import org.bukkit.inventory.InventoryHolder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GuiDiscreteButtonHandler {
    Class <? extends InventoryHolder> guiPage();
    int[] slot();


}
