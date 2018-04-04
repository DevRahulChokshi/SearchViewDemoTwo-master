package in.ebc.searchviewdemotwo;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    SearchView sv;
    String TAG=MainActivity.class.getSimpleName ();
    String user_id="13";
    ArrayList<Player> players ;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);

        players=new ArrayList<> ();

        FloatingActionButton fab = (FloatingActionButton) findViewById (R.id.fab);
        fab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                Snackbar.make (view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction ("Action", null).show ();
            }
        });

        sv = (SearchView) findViewById (R.id.mSearch);
        RecyclerView rv = (RecyclerView) findViewById (R.id.myRecycler);

        //SET ITS PROPETRIES
        rv.setLayoutManager (new LinearLayoutManager (this));
        rv.setItemAnimator (new DefaultItemAnimator ());

        getData ();

        //ADAPTER
        final MyAdapter adapter = new MyAdapter (this, players);
        rv.setAdapter (adapter);

        //SEARCH
        sv.setOnQueryTextListener (new SearchView.OnQueryTextListener () {
            @Override
            public boolean onQueryTextSubmit (String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange (String query) {
                //FILTER AS YOU TYPE
                adapter.getFilter ().filter (query);
                return false;
            }
        });


    }

//    //ADD PLAYERS TO ARRAYLIST
//    private ArrayList<Player> getPlayers () {
//        ArrayList<Player> players = new ArrayList<> ();
//        Player p = new Player ();
//        p.setName ("Ander Herera");
//        p.setPos ("Midfielder");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//        p = new Player ();
//        p.setName ("David De Geaa");
//        p.setPos ("Goalkeeper");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//        p = new Player ();
//        p.setName ("Michael Carrick");
//        p.setPos ("Midfielder");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//        p = new Player ();
//        p.setName ("Juan Mata");
//        p.setPos ("Playmaker");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//        p = new Player ();
//        p.setName ("Diego Costa");
//        p.setPos ("Striker");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//        p = new Player ();
//        p.setName ("Oscar");
//        p.setPos ("Playmaker");
//        p.setImg (R.drawable.ic_launcher_background);
//        players.add (p);
//
//
//        return players;
//    }


    private void getData(){
        //Creating a string request
        StringRequest stringRequest = new StringRequest (Request.Method.POST,Constants.URL_SHOW_LEAD_LIST,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JSONArray jsonArray = null;
                        try {
                            //Parsing the fetched Json String to JSON Object
                            jsonArray = new JSONArray (response);

                            if (!response.equals (Constants.RESPONSE_STATUS_FAIL)){
                                for (int i=0;i<=jsonArray.length ();i++){
                                    try{

                                        Player leadListData=new Player ();
                                        String CompanyID=jsonArray.getJSONObject (i).getString ("id");
                                        Log.i (TAG,"COMPANY ID:"+CompanyID);
                                        String CompanyName=jsonArray.getJSONObject (i).getString ("name");
                                        String CompanyEmail=jsonArray.getJSONObject (i).getString ("email");
                                        leadListData.setCompanyDescription (CompanyEmail);
                                        leadListData.setCompanyLatter (CompanyID);
                                        leadListData.setCompanyTitle (CompanyName);

                                        players.add (leadListData);

                                    }catch (JSONException e){
                                        e.printStackTrace ();
                                    }
                                }
                            }
                            else {
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                })
        {
            @Override
            protected Map<String, String> getParams () throws AuthFailureError {
                Map<String,String> stringMap=new HashMap<> ();
                stringMap.put (Constants.USER_ID,user_id);
                Log.i (TAG,"USER ID:-"+user_id);
                return stringMap;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext ());
        requestQueue.add(stringRequest);
    }
}


