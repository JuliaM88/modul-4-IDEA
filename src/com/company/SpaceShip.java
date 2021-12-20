package com.company;

    public class SpaceShip {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (!name.isEmpty() && !name.isBlank()){
                return;
            }
            if (name.length() < 100) {
                return;
            }
        }
        //Test output
        public static void main(String[] args) {
            SpaceShip ship = new SpaceShip();
            ship.setName("Walker");
            System.out.println(ship.getName()); //Should be Walker

            ship.setName("");
            System.out.println(ship.getName()); //Should be Walker, empty value ignored

            ship.setName("VoyagerVoyagerVoyagerVoyagennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrVoyagerVoyagerVoyagerVoyagerVoyagerVoyagerVoyageryagerVoyagerVoyagerrepeat");
            System.out.println(ship.getName()); //Should be Walker, too long value ignored
        }
    }

