package org.codecentral.spaceinvaders;

import java.awt.*;

class player {
    int x = 550;
    int x2 = 900;
    int x3 = 800;
    int x4 = 700;
    int y = 850;
    int y2 = 50;
    int y3 = 50;
    int y4 = 50;
    int e = 0;

    public void death(alien a, Graphics g) {

        if (a.ya >= y - 200 && a.ya <= y - 169 && a.xa >= x - 400 && a.xa <= x + 100) {
            x += 10000;
            x2 = 550;
            y2 = 850;
            e = 1;

            if (e == 1) {
                if (a.ya >= y - 200 && a.ya <= y - 169 && a.xa >= x - 400 && a.xa <= x + 100) {
                    x2 += 10000;
                    x3 -= 800;
                    y3 -= 200;
                    x3 += 550;
                    y3 += 850;
                    e = 2;
                }
            }
            if (e == 2) {
                if (a.ya >= y - 200 && a.ya <= y - 169 && a.xa >= x - 400 && a.xa <= x + 100) {
                    x3 += 10000;
                    x4 -= 800;
                    y4 -= 200;
                    x4 += 550;
                    y4 += 850;
                    e = 3;
                }
            }
            if (e == 3) {
                if (a.ya >= y - 200 && a.ya <= y - 169 && a.xa >= x - 400 && a.xa <= x + 100) {
                    x4 += 10000;
                    e = 4;
                    g.setFont(new Font("Courier", Font.PLAIN, 800));
                    g.drawString("GAME OVER", 100, 500);
                }
            }
        }
    }

    public void background(Graphics g) {
        Color Black = new Color(0, 0, 0);
        g.setColor(Black);
        g.fillRect(0, 0, 1300, 1000);
    }

    public void draw(Graphics g) {
        Color Green = new Color(0, 255, 0);
        g.setColor(Green);
        g.fillRect(x, y, 70, 30);
        g.fillRect(x + 33, y - 20, 6, 37);

        Color Blue = new Color(0, 0, 255);
        g.setColor(Blue);
        g.fillRect(x2, y2, 70, 30);
        g.fillRect(x2 + 33, y2 - 20, 6, 37);

        Color Red = new Color(255, 0, 0);
        g.setColor(Red);
        g.fillRect(x3, y3, 70, 30);
        g.fillRect(x3 + 33, y3 - 20, 6, 37);

        Color White = new Color(255, 255, 255);
        g.setColor(White);
        g.fillRect(x4, y4, 70, 30);
        g.fillRect(x4 + 33, y4 - 20, 6, 37);
    }

    public void move(shoot b) {
        if (e == 0) {
            if (InputHandler.RIGHT) {
                x += 15;

            }
            if (InputHandler.LEFT) {
                x -= 15;
            }
            if (InputHandler.D) {
                x += 15;
            }
            if (InputHandler.A) {
                x -= 15;
            }
        }
        if (e == 1) {
            if (InputHandler.RIGHT) {
                x2 += 15;

            }
            if (InputHandler.LEFT) {
                x2 -= 15;
            }
            if (InputHandler.D) {
                x2 += 15;
            }
            if (InputHandler.A) {
                x2 -= 15;
            }
        }
        if (e == 2) {
            if (InputHandler.RIGHT) {
                x3 += 15;

            }
            if (InputHandler.LEFT) {
                x3 -= 15;
            }
            if (InputHandler.D) {
                x3 += 15;
            }
            if (InputHandler.A) {
                x3 -= 15;
            }
        }
        if (e == 3) {
            if (InputHandler.RIGHT) {
                x4 += 15;

            }
            if (InputHandler.LEFT) {
                x4 -= 15;
            }
            if (InputHandler.D) {
                x4 += 15;
            }
            if (InputHandler.A) {
                x4 -= 15;
            }
        }


        if (e == 0) {
            if (InputHandler.SPACE) {
                b.x = x + 35;
                b.y = y - 6;
            }
        }
        if (e == 1) {
            if (InputHandler.SPACE) {
                b.x = x2 + 35;
                b.y = y2 - 6;
            }
        }
        if (e == 2) {
            if (InputHandler.SPACE) {
                b.x = x3 + 35;
                b.y = y3 - 6;
            }
        }
        if (e == 3) {
            if (InputHandler.SPACE) {
                b.x = x4 + 35;
                b.y = y4 - 6;
            }
        }

    }

    public void wall() {
        if (e == 0) {
            if (x <= 0) {
                x += 40;
            }
            if (x >= 1175) {
                x -= 40;
            }
        }
        if (e == 1) {
            if (x2 <= 0) {
                x2 += 40;
            }
            if (x2 >= 1175) {
                x2 -= 40;
            }
        }
        if (e == 2) {
            if (x3 <= 0) {
                x3 += 40;
            }
            if (x3 >= 1175) {
                x3 -= 40;
            }
        }
        if (e == 3) {
            if (x4 <= 0) {
                x4 += 40;
            }
            if (x4 >= 1175) {
                x4 -= 40;
            }
        }
    }
}
