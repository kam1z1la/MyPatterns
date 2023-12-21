package com.myprojects.patterns.structural.flyweight;

public enum Varieties {
    OAK {
        @Override
        int getMaxLife() {
            return 400;
        }

        @Override
        int getMaxWidth() {
            return 30;
        }

        @Override
        int getMaxHeight() {
            return 40;
        }
    },
    BEECH {
        @Override
        int getMaxLife() {
            return 300;
        }

        @Override
        int getMaxWidth() {
            return 25;
        }

        @Override
        int getMaxHeight() {
            return 35;
        }
    },
    PINE {
        @Override
        int getMaxLife() {
            return 500;
        }

        @Override
        int getMaxWidth() {
            return 15;
        }

        @Override
        int getMaxHeight() {
            return 40;
        }
    },
    SPRUCE {
        @Override
        int getMaxLife() {
            return 600;
        }

        @Override
        int getMaxWidth() {
            return 20;
        }

        @Override
        int getMaxHeight() {
            return 30;
        }
    },
    LINDEN {
        @Override
        int getMaxLife() {
            return 300;
        }

        @Override
        int getMaxWidth() {
            return 20;
        }

        @Override
        int getMaxHeight() {
            return 30;
        }
    },
    MAPLE {
        @Override
        int getMaxLife() {
            return 300;
        }

        @Override
        int getMaxWidth() {
            return 15;
        }

        @Override
        int getMaxHeight() {
            return 25;
        }
    },
    ASH {
        @Override
        int getMaxLife() {
            return 200;
        }

        @Override
        int getMaxWidth() {
            return 15;
        }

        @Override
        int getMaxHeight() {
            return 25;
        }
    },
    ASPEN {
        @Override
        int getMaxLife() {
            return 150;
        }

        @Override
        int getMaxWidth() {
            return 10;
        }

        @Override
        int getMaxHeight() {
            return 25;
        }
    },
    CHERRY {
        @Override
        int getMaxLife() {
            return 150;
        }

        @Override
        int getMaxWidth() {
            return 15;
        }

        @Override
        int getMaxHeight() {
            return 20;
        }
    },
    APPLE_TREE {
        @Override
        int getMaxLife() {
            return 100;
        }

        @Override
        int getMaxWidth() {
            return 10;
        }

        @Override
        int getMaxHeight() {
            return 10;
        }
    };

    abstract int getMaxLife();
    abstract int getMaxWidth();
    abstract int getMaxHeight();
}
