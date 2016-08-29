import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String privacy;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public String organizer_description;
	public VersionModel _version;
	public CreatorModel _creator;
	public String background_image;
	public String end_time;
	public int id;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String location_name;
	public String description;
	public String state;

	public RootModel(String schedule_published_on, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links, String logo, String privacy, String organizer_name, String type, CopyrightModel copyright, String organizer_description, VersionModel version, CreatorModel creator, String background_image, String end_time, int id, String timezone, String name, Call_for_papersModel call_for_papers, String start_time, String topic, String location_name, String description, String state) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._version = version;
		this._creator = creator;
		this.background_image = background_image;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;
		this.state = state;

	}

}