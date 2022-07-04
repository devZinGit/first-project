public static double findExpensesSumHamster(double[] feedExpensesHamster) {
        double sumFeedHamster = 0;
            for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
            }
        return sumFeedHamster;
        }

        public static void sayEnjoyMealHamster() {
            System.out.println("Приятного аппетита, Байт!");
        }