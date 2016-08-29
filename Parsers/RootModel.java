import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String description;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String topic;
	public String logo;
	public String email;
	public String type;
	public String end_time;
	public String location_name;
	public String state;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String start_time;
	public String schedule_published_on;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public int id;
	public VersionModel _version;
	public String background_image;

	public RootModel(Call_for_papersModel call_for_papers, String description, String timezone, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String topic, String logo, String email, String type, String end_time, String location_name, String state, String code_of_conduct, CopyrightModel copyright, String start_time, String schedule_published_on, String name, String organizer_name, String organizer_description, int id, VersionModel version, String background_image) {

		this._call_for_papers = call_for_papers;
		this.description = description;
		this.timezone = timezone;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this.type = type;
		this.end_time = end_time;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this._version = version;
		this.background_image = background_image;

	}

}