@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    
    // Проверяем, что метод вернул true, если возраст больше 18
    assertEquals("Ожидалось, что метод вернет true для возраста 19", true, isAdult);
}
