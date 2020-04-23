package com.company;

public class Reward {

    private String reward;
    public Reward(int type) {
        if ( type == 1 ) {
            reward = rewardAnaf;
        } else if ( type == 2 ) {
            reward = rewardCnass;
        } else if ( type == 3 ) {
            reward = rewardWifi;
        }
    }

private String rewardAnaf =
                        "                                   \" ____\\n\" +\n" +
                        "                \"                 _.' :  `._\\n\" +\n" +
                        "                \"             .-.'`.  ;   .'`.-.\\n\" +\n" +
                        "                \"    __      / : ___\\\\ ;  /___ ; \\\\      __\\n\" +\n" +
                        "                \"  ,'_ \\\"\\\"--.:__;\\\".-.\\\";: :\\\".-.\\\":__;.--\\\"\\\" _`,\\n\" +\n" +
                        "                \"  :' `.t\\\"\\\"--.. '<@.`;_  ',@>` ..--\\\"\\\"j.' `;\\n\" +\n" +
                        "                \"       `:-.._J '-.-'L__ `-- ' L_..-;'\\n\" +\n" +
                        "                \"         \\\"-.__ ;  .-\\\"  \\\"-.  : __.-\\\"\\n\" +\n" +
                        "                \"             L ' /.------.\\\\ ' J\\n\" +\n" +
                        "                \"              \\\"-.   \\\"--\\\"   .-\\\"\\n\" +\n" +
                        "                \"             __.l\\\"-:_JL_;-\\\";.__\\n\" +\n" +
                        "                \"          .-j/'.;  ;\\\"\\\"\\\"\\\"  / .'\\\\\\\"-.\\n\" +\n" +
                        "                \"        .' /:`. \\\"-.:     .-\\\" .';  `.\\n\" +\n" +
                        "                \"     .-\\\"  / ;  \\\"-. \\\"-..-\\\" .-\\\"  :    \\\"-.\\n\" +\n" +
                        "                \"  .+\\\"-.  : :      \\\"-.__.-\\\"      ;-._   \\\\\\n\" +\n" +
                        "                \"  ; \\\\  `.; ;                    : : \\\"+. ;\\n\" +\n" +
                        "                \"  :  ;   ; ;                    : ;  : \\\\:\\n\" +\n" +
                        "                \" : `.\\\"-; ;  ;                  :  ;   ,/;\\n\" +\n" +
                        "                \"  ;    -: ;  :                ;  : .-\\\"'  :\\n\" +\n" +
                        "                \"  :\\\\     \\\\  : ;             : \\\\.-\\\"      :\\n\" +\n" +
                        "                \"   ;`.    \\\\  ; :            ;.'_..--  / ;\\n\" +\n" +
                        "                \"   :  \\\"-.  \\\"-:  ;          :/.\\\"      .'  :\\n\" +\n" +
                        "                \"     \\\\       .-`.\\\\        /t-\\\"\\\"  \\\":-+.   :\\n\" +\n" +
                        "                \"      `.  .-\\\"    `l    __/ /`. :  ; ; \\\\  ;\\n\" +\n" +
                        "                \"        \\\\   .-\\\" .-\\\"-.-\\\"  .' .'j \\\\  /   ;/\\n\" +\n" +
                        "                \"         \\\\ / .-\\\"   /.     .'.' ;_:'    ;\\n\" +\n" +
                        "                \"          :-\\\"\\\"-.`./-.'     /    `.___.'\\n\" +\n" +
                        "                \"                \\\\ `t  ._  /\\n\" +\n" +
                        "                \"                 \\\"-.t-._:'\" ";


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

    public static void rewardAnaf(){

        String reward = "                           \" ____\\n\" +\n" +
                        "                \"                 _.' :  `._\\n\" +\n" +
                        "                \"             .-.'`.  ;   .'`.-.\\n\" +\n" +
                        "                \"    __      / : ___\\\\ ;  /___ ; \\\\      __\\n\" +\n" +
                        "                \"  ,'_ \\\"\\\"--.:__;\\\".-.\\\";: :\\\".-.\\\":__;.--\\\"\\\" _`,\\n\" +\n" +
                        "                \"  :' `.t\\\"\\\"--.. '<@.`;_  ',@>` ..--\\\"\\\"j.' `;\\n\" +\n" +
                        "                \"       `:-.._J '-.-'L__ `-- ' L_..-;'\\n\" +\n" +
                        "                \"         \\\"-.__ ;  .-\\\"  \\\"-.  : __.-\\\"\\n\" +\n" +
                        "                \"             L ' /.------.\\\\ ' J\\n\" +\n" +
                        "                \"              \\\"-.   \\\"--\\\"   .-\\\"\\n\" +\n" +
                        "                \"             __.l\\\"-:_JL_;-\\\";.__\\n\" +\n" +
                        "                \"          .-j/'.;  ;\\\"\\\"\\\"\\\"  / .'\\\\\\\"-.\\n\" +\n" +
                        "                \"        .' /:`. \\\"-.:     .-\\\" .';  `.\\n\" +\n" +
                        "                \"     .-\\\"  / ;  \\\"-. \\\"-..-\\\" .-\\\"  :    \\\"-.\\n\" +\n" +
                        "                \"  .+\\\"-.  : :      \\\"-.__.-\\\"      ;-._   \\\\\\n\" +\n" +
                        "                \"  ; \\\\  `.; ;                    : : \\\"+. ;\\n\" +\n" +
                        "                \"  :  ;   ; ;                    : ;  : \\\\:\\n\" +\n" +
                        "                \" : `.\\\"-; ;  ;                  :  ;   ,/;\\n\" +\n" +
                        "                \"  ;    -: ;  :                ;  : .-\\\"'  :\\n\" +\n" +
                        "                \"  :\\\\     \\\\  : ;             : \\\\.-\\\"      :\\n\" +\n" +
                        "                \"   ;`.    \\\\  ; :            ;.'_..--  / ;\\n\" +\n" +
                        "                \"   :  \\\"-.  \\\"-:  ;          :/.\\\"      .'  :\\n\" +\n" +
                        "                \"     \\\\       .-`.\\\\        /t-\\\"\\\"  \\\":-+.   :\\n\" +\n" +
                        "                \"      `.  .-\\\"    `l    __/ /`. :  ; ; \\\\  ;\\n\" +\n" +
                        "                \"        \\\\   .-\\\" .-\\\"-.-\\\"  .' .'j \\\\  /   ;/\\n\" +\n" +
                        "                \"         \\\\ / .-\\\"   /.     .'.' ;_:'    ;\\n\" +\n" +
                        "                \"          :-\\\"\\\"-.`./-.'     /    `.___.'\\n\" +\n" +
                        "                \"                \\\\ `t  ._  /\\n\" +\n" +
                        "                \"                 \\\"-.t-._:'\" ";


    }

    public static void rewardCnass(){
    System.out.println (
            "_____________________                              _____________________\n" +
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
            "                                   \\/ " );
}

    public static void rewardWifi(){
    System.out.println (
            "                         ,--.\"\"\n" +
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
            "                      `._\\_\\" );
}

    public String getRewardAnaf() {
        return rewardAnaf;
    }

    public String getRewardCnass() {
        return rewardCnass;
    }

    public String getRewardWifi() {
        return rewardWifi;
    }

    public String getReward(){
        return reward;
    }
}
