package House.Building;

    public  class Flat {
        private int rooms;
        private  int square;
        private final static int  ROOMS=2;
        private final static int SQUARE=50;

        public Flat(int rooms, int square) {
           this.rooms=rooms;
           this.square=square;
        }

        public Flat() {
            this.rooms=ROOMS;
            this.square=SQUARE;
        }

        public int getRooms() {

            return rooms;
        }

       public void setRooms(int rooms) {this.rooms=rooms;}

        public int getSquare() {
            return square;
        }

        public void setSquare(int square) {
          this.square=square;}

    }



