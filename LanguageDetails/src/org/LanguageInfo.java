package org;

public class LanguageInfo extends StateDetails{
	private void tamilLanguage() {
		System.out.println("Tamil");
	}

	private void englishLanguage() {
		System.out.println("English");
	}

	private void hindiLanguage() {
		System.out.println("Hindi");
	}

	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.southIndia();
		l.northIndia();
	}
}