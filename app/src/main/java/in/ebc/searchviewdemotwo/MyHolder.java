package in.ebc.searchviewdemotwo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    //OUR VIEWS

    TextView nameLatter,companyTittle,companyDescription;

    ItemClickListener itemClickListener;


    public MyHolder(View itemView) {
        super(itemView);

        this.nameLatter= (TextView) itemView.findViewById(R.id.txtUser);
        this.companyTittle= (TextView) itemView.findViewById(R.id.txtLeadTitle);
        this.companyDescription= (TextView) itemView.findViewById(R.id.txtUserEmail);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}