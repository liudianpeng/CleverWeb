package com.toquery.cleverweb.entity.vo;

import com.toquery.cleverweb.entity.po.TbSysMenu;

import java.util.List;

public class SysMenu extends TbSysMenu {
    private String target;
    private SysMenu parentMenu;
    private List<SysMenu> subMenu;
    private boolean hasMenu = false;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public SysMenu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(SysMenu parentMenu) {
        this.parentMenu = parentMenu;
    }

    public List<SysMenu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<SysMenu> subMenu) {
        this.subMenu = subMenu;
    }

    public boolean isHasMenu() {
        return hasMenu;
    }

    public void setHasMenu(boolean hasMenu) {
        this.hasMenu = hasMenu;
    }
}
