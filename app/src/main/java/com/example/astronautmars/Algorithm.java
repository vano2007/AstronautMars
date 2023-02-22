package com.example.astronautmars;

public class Algorithm {

    public Algorithm() {
    }
    // метод вычисляющий необходимый объем топлива по величине массы выводимого на орбиту груза
    public double massCalculation(String input) {

        float k = (float) (9.80665/3.721);

        /** Необходимо проверить корректность ввода массы груза, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (inputFloat * 100 / k);

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (inputFloat * 100 / k);
        }
    }

}
