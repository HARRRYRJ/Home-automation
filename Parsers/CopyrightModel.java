
class CopyrightModel {

	public String licence_url;
	public String holder;
	public String licence;
	public String holder_url;
	public int year;
	public String logo;

	public CopyrightModel(String licence_url, String holder, String licence, String holder_url, int year, String logo) {

		this.licence_url = licence_url;
		this.holder = holder;
		this.licence = licence;
		this.holder_url = holder_url;
		this.year = year;
		this.logo = logo;

	}

}