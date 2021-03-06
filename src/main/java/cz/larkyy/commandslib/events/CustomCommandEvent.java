package cz.larkyy.commandslib.events;

import cz.larkyy.commandslib.CustomCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CustomCommandEvent extends Event implements Cancellable {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean isCancelled;
    private final CommandSender sender;
    private final String labelName;
    private final String[] args;
    private final CustomCommand cmd;

    public CustomCommandEvent(CustomCommand cmd, CommandSender sender, String labelName, String[]args) {
        this.sender = sender;
        this.labelName = labelName;
        this.args = args;
        this.cmd = cmd;
        this.isCancelled = false;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public CommandSender getSender() {
        return sender;
    }

    public String getLabelName() {
        return labelName;
    }

    public String[] getArgs() {
        return args;
    }

    public CustomCommand getCmd() {
        return cmd;
    }
}
