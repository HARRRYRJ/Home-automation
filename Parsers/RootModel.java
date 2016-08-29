import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public String code_of_conduct;
	public String name;
	public CopyrightModel _copyright;
	public String type;
	public String end_time;
	public String logo;
	public String organizer_name;
	public String background_image;
	public int id;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String timezone, String schedule_published_on, String location_name, String organizer_description, String code_of_conduct, String name, CopyrightModel copyright, String type, String end_time, String logo, String organizer_name, String background_image, int id, String topic, Call_for_papersModel call_for_papers, String email, String start_time, CreatorModel creator, String description, VersionModel version, String privacy, ArrayList<Social_linksModel> social_links, String state) {

		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._copyright = copyright;
		this.type = type;
		this.end_time = end_time;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this.social_links = social_links;
		this.state = state;

	}

}