
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder_url;
	public String logo;
	public String holder;
	public int year;

	public CopyrightModel(String licence_url, String licence, String holder_url, String logo, String holder, int year) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder_url = holder_url;
		this.logo = logo;
		this.holder = holder;
		this.year = year;

	}

}