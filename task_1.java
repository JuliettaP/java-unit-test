@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
   assertEquals("���������� ��������� �� �����", true, isAdult);
}