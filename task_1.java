@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);

        boolean expected = true;  // ожидаемое значение

        assertEquals("Больше 18", expected, isAdult);

        }