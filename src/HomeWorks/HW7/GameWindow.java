package HomeWorks.HW7;

import javax.swing.*;
import java.awt.*;
    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 03.02.2022
     * Subsequent changes when doing homework by Yuriy Lomtev 06/02/2022
     */
    public class GameWindow extends JFrame {
        // размеры:
        private int width = 624;
        private int height = 568;
        private int posX = 100;
        private int posY = 50;
        // кнопки:
        private JButton btnStart;
        private JButton btnExit;
        // поля на окне:
        private JPanel mainToolsPanel;
        private JPanel settingPanel;
        // отдельно игровое поле:
        private Map map;
        // подготваливаем игровое окно:
        GameWindow() {
            prepareWindow();
            prepareToolsPanel();
            prepareButtons();
            prepareSettingsPanel();

            map = new Map();

            mainToolsPanel.add(settingPanel, BorderLayout.NORTH);
            add(mainToolsPanel, BorderLayout.EAST);
            add(map);
// пробы размещения игрового поля: add(map, BorderLayout.WEST);
            // подготовили все, отображаем:
            setVisible(true);
        }
        private void prepareWindow() {
            // параметры окна:
            setSize(width, height);
            setLocation(posX, posY);
            setTitle("Application");
            setResizable(false);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
        private void prepareToolsPanel() {
            // место для
            mainToolsPanel = new JPanel();
            // 2 строки ниже роли почти не играют, т.к. ниже перезаписываются:
            mainToolsPanel.setBackground(Color.GREEN);
            mainToolsPanel.setLayout(new GridLayout(2,1)); // rows только для размеров кнопок
        }
        private void prepareButtons() {
            // кнопки:
            btnStart = new JButton("Start game");
            btnExit = new JButton("End game");
        }
        private void prepareSettingsPanel() {
            // место для кнопок:
            settingPanel = new JPanel();
            mainToolsPanel.setBackground(Color.BLUE);
            settingPanel.setLayout(new GridLayout(4,1));

            settingPanel.add(btnStart);
            settingPanel.add(btnExit);
        }
    }

