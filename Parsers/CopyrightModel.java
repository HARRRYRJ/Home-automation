
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String licence;
	public String logo;
	public int year;
	public String licence_url;

	public CopyrightModel(String holder_url, String holder, String licence, String logo, int year, String licence_url) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;
		this.logo = logo;
		this.year = year;
		this.licence_url = licence_url;

	}

}