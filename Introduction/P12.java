public static String findDay(int month, int day, int year) {
		LocalDate dt = LocalDate.of(year, month, day);
		return dt.getDayOfWeek().toString();
}
