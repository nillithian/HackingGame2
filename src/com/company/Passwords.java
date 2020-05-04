package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Passwords {
    private ArrayList<String> neighbourPasswords = new ArrayList<String> ( Arrays.asList ( "neighbour", "cluj", "duck", "stay", "home", "blonde" ) );
    private ArrayList<String> anafPasswords = new ArrayList<String> ( Arrays.asList ( "file", "map", "stapler", "bribe", "home", "blonde" ) );
    private ArrayList<String> cnassPasswords = new ArrayList<String> ( Arrays.asList ( "covid", "health", "hospital", "sneeze", "doctor", "disease" ) );
    private ArrayList<String> passwords;
    private String reward;

    private String rewardAnaf =
            "                                    ____\\n\" +\n" +
                    "                                 _.' :  `._\\n\" +\n" +
                    "                             .-.'`.  ;   .'`.-.\\n\" +\n" +
                    "                    __      / : ___\\\\ ;  /___ ; \\\\      __\\n\" +\n" +
                    "                  ,'_ \\\"\\\"--.:__;\\\".-.\\\";: :\\\".-.\\\":__;.--\\\"\\\" _`,\\n\" +\n" +
                    "                  :' `.t\\\"\\\"--.. '<@.`;_  ',@>` ..--\\\"\\\"j.' `;\\n\" +\n" +
                    "                       `:-.._J '-.-'L__ `-- ' L_..-;'\\n\" +\n" +
                    "                         \\\"-.__ ;  .-\\\"  \\\"-.  : __.-\\\"\\n\" +\n" +
                    "                             L ' /.------.\\\\ ' J\\n\" +\n" +
                    "                              \\\"-.   \\\"--\\\"   .-\\\"\\n\" +\n" +
                    "                            __.l\\\"-:_JL_;-\\\";.__\\n\" +\n" +
                    "                          .-j/'.;  ;\\\"\\\"\\\"\\\"  / .'\\\\\\\"-.\\n\" +\n" +
                    "                        .' /:`. \\\"-.:     .-\\\" .';  `.\\n\" +\n" +
                    "                     .-\\\"  / ;  \\\"-. \\\"-..-\\\" .-\\\"  :    \\\"-.\\n\" +\n" +
                    "                  .+\\\"-.  : :      \\\"-.__.-\\\"      ;-._   \\\\\\n\" +\n" +
                    "                  ; \\\\  `.; ;                    : : \\\"+. ;\\n\" +\n" +
                    "                  :  ;   ; ;                    : ;  : \\\\:\\n\" +\n" +
                    "                 : `.\\\"-; ;  ;                  :  ;   ,/;\\n\" +\n" +
                    "                  ;    -: ;  :                ;  : .-\\\"'  :\\n\" +\n" +
                    "                  :\\\\     \\\\  : ;             : \\\\.-\\\"      :\\n\" +\n" +
                    "                   ;`.    \\\\  ; :            ;.'_..--  / ;\\n\" +\n" +
                    "                   :  \\\"-.  \\\"-:  ;          :/.\\\"      .'  :\\n\" +\n" +
                    "                     \\\\       .-`.\\\\        /t-\\\"\\\"  \\\":-+.   :\\n\" +\n" +
                    "                      `.  .-\\\"    `l    __/ /`. :  ; ; \\\\  ;\\n\" +\n" +
                    "                        \\\\   .-\\\" .-\\\"-.-\\\"  .' .'j \\\\  /   ;/\\n\" +\n" +
                    "                         \\\\ / .-\\\"   /.     .'.' ;_:'    ;\\n\" +\n" +
                    "                          :-\\\"\\\"-.`./-.'     /    `.___.'\\n\" +\n" +
                    "                                \\\\ `t  ._  /\\n\" +\n" +
                    "                                 \\\"-.t-._:'\" ";


    private String rewardCnass =    "_____________________                                _____________________\n" +
            "`-._:  .:'   `:::  .:\\           |\\__/|           /::  .:'   `:::  .:.-'\n" +
            "    \\      :          \\          |:   |          /         :       /    \n" +
            "     \\     ::    .     `-_______/ ::   \\_______-'   .      ::   . /      \n" +
            "      |  :   :: ::'  :   :: ::'  :   :: ::'      :: ::'  :   :: :|       \n" +
            "      |     ;::         ;::         ;::         ;::         ;::  |       \n" +
            "      |  .:'   `:::  .:'   `:::  .:'   `:::  .:'   `:::  .:'   `:|       \n" +
            "      /     :           :           :           :           :    \\       \n" +
            "     /______::_____     ::    .     ::    .     ::   _____._::____\\      \n" +
            "                   `----._:: ::'  :   :: ::'  _.----'                    \n" +
            "                          `--.       ;::  .--'                           \n" +
            "                              `-. .:'  .-'                               \n" +
            "                                 \\    /                                 \n" +
            "                                  \\  /                                   \n" +
            "                                   \\/ " ;

    private String rewardWifi =     "                              ,--.\"\"\n" +
            "                      __,----( o ))\n" +
            "                    ,'--.      , (\n" +
            "             -\"\",:-(    o ),-'/  ;\n" +
            "               ( o) `o  _,'\\ / ;(\n" +
            "                `-;_-<'\\_|-'/ '  )\n" +
            "                    `.`-.__/ '   |\n" +
            "       \\`.            `. .__,   ;\n" +
            "        )_;--.         \\`       |\n" +
            "       /'(__,-:         )      ;\n" +
            "     ;'    (_,-:     _,::     .|\n" +
            "    ;       ( , ) _,':::'    ,;\n" +
            "   ;         )-,;'  `:'     .::\n" +
            "   |         `'  ;         `:::\\\n" +
            "   :       ,'    '            `:\\\n" +
            "   ;:    '  _,-':         .'     `-.\n" +
            "    ';::..,'  ' ,        `   ,__    `.\n" +
            "      `;''   / ;           _;_,-'     `.\n" +
            "            /            _;--.          \\\n" +
            "          ,'            / ,'  `.         \\\n" +
            "         /:            (_(   ,' \\         )\n" +
            "        /:.               \\_(  /-. .:::,;/\n" +
            "       (::..                 `-'\\ \"`\"\"'\n" +
            "       ;::::.                    \\        __\n" +
            "       ,::::::.            .:'    )    ,-'  )\n" +
            "      /  `;:::::::'`__,:.:::'    /`---'   ,'\n" +
            "     ;    `\"\"\"\"'   (  \\:::'     /     _,-'\n" +
            "     ;              \\  \\:'    ,';:.,-'\n" +
            "     (              :  )\\    (\n" +
            "      `.             \\   \\    ;\n" +
            "        `-.___       : ,\\ \\  (\n" +
            "           ,','._::::| \\ \\ \\  \\\n" +
            "          (,(,---;;;;;  \\ \\|;;;)\n" +
            "                      `._\\_\\";


    public Passwords(int type) {
        if ( type == 1 ) {
            passwords = anafPasswords;
            reward = rewardAnaf;
        } else if ( type == 2 ) {
            passwords = cnassPasswords;
            reward = rewardCnass;
        } else if ( type == 3 ) {
            passwords = neighbourPasswords;
            reward = rewardWifi;
        }
    }


    public ArrayList<String> getPasswords() {
        return passwords;
    }

    public String getReward(){
        return reward;
    }




}
