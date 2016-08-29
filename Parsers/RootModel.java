import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_name;
	public String start_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String location_name;
	public String background_image;
	public String email;
	public String end_time;
	public String state;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public String organizer_description;
	public String description;
	public String topic;
	public CreatorModel _creator;
	public String privacy;
	public int id;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, String name, String organizer_name, String start_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, String type, String location_name, String background_image, String email, String end_time, String state, String logo, String timezone, String schedule_published_on, String organizer_description, String description, String topic, CreatorModel creator, String privacy, int id, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.name = name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.type = type;
		this.location_name = location_name;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.state = state;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.description = description;
		this.topic = topic;
		this._creator = creator;
		this.privacy = privacy;
		this.id = id;
		this._version = version;

	}

}