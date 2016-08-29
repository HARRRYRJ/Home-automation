import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String end_time;
	public String type;
	public String privacy;
	public String start_time;
	public String state;
	public String name;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, String email, VersionModel version, String organizer_name, String logo, String code_of_conduct, String topic, String timezone, String end_time, String type, String privacy, String start_time, String state, String name, String organizer_description, String description, String schedule_published_on, CreatorModel creator, String location_name, int id, String background_image, ArrayList<Social_linksModel> social_links, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;
		this.name = name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this._copyright = copyright;

	}

}