package water.pipes;

public class Condition implements Cloneable {
        private String stage;
        public Condition(String  stage) {
            this.stage = stage;
        }
        public String getStage() {
            return stage;
        }
        public void setStage(String stage) {
            this.stage = stage;
        }
        @Override
        public String toString() {
            return " "+ stage;
        }

        @Override
        public Condition clone() throws CloneNotSupportedException {
            return (Condition) super.clone();
        }
    }

