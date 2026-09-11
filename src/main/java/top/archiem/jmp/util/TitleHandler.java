package top.archiem.jmp.util;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import top.archiem.jmp.JMP;

public class TitleHandler {
    private Player player;
    private final TextFormat tfInstance = new TextFormat(JMP.getPlugin(JMP.class).papienabled);

    public TitleHandler(Player player){
        this.player = player;
    }

    public Title titleBuilder(String title, String subtitle, @Nullable Times times){
        Component titleComponent = tfInstance.format(title, player);
        Component subtitleComponent = tfInstance.format(subtitle, player);

        if (times != null) {
            return Title.title(titleComponent, subtitleComponent, times);
        }
        return Title.title(titleComponent, subtitleComponent);
    }

}
