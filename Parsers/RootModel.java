import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String schedule_published_on;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;
	public String code_of_conduct;
	public int id;
	public String location_name;
	public String email;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String background_image;
	public String topic;
	public String description;
	public String timezone;
	public String state;
	public String privacy;
	public String start_time;

	public RootModel(Call_for_papersModel call_for_papers, String name, String schedule_published_on, String logo, ArrayList<Social_linksModel> social_links, VersionModel version, String type, String code_of_conduct, int id, String location_name, String email, String organizer_description, CreatorModel creator, String end_time, CopyrightModel copyright, String organizer_name, String background_image, String topic, String description, String timezone, String state, String privacy, String start_time) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.social_links = social_links;
		this._version = version;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.location_name = location_name;
		this.email = email;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.state = state;
		this.privacy = privacy;
		this.start_time = start_time;

	}

}