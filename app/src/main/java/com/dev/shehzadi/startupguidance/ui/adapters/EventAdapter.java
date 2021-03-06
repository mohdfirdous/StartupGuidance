package com.dev.shehzadi.startupguidance.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dev.shehzadi.startupguidance.R;
import com.dev.shehzadi.startupguidance.models.EventModel;
import com.dev.shehzadi.startupguidance.ui.activities.HomeActivity;
import com.dev.shehzadi.startupguidance.ui.activities.ViewEventActivity;

import java.util.Date;
import java.util.List;

import static com.dev.shehzadi.startupguidance.utils.Util.NON_HYPHENATED_PATTERN;
import static com.dev.shehzadi.startupguidance.utils.Util.getFormattedDate;

/**
 * Created by shehzadi on 3/27/2018.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    private List<EventModel> events;
    private Context context;

    public EventAdapter(Context context, List<EventModel> events) {
        this.events = events;
        this.context = context;

        Log.e("EventsCount", "" + events.size());
    }

    @NonNull
    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listitem_event, parent, false);
        return new EventAdapter.EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventAdapter.EventViewHolder holder, int position) {

        EventModel event = events.get(position);

        String photoLocation = event.getPhotoLocation();
        String eventName = event.getEventTitle();
        String eventDate = getFormattedDate(event.getEventDate(), NON_HYPHENATED_PATTERN);

        if(!TextUtils.isEmpty(photoLocation)){
            Glide.with(context)
                    .load(photoLocation)
                    .into(holder.ivEventBanner);
        }
        else{
            Bitmap bmp = ((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_event_512)).getBitmap();
            holder.ivEventBanner.setImageBitmap(bmp);
        }


        if (!TextUtils.isEmpty(eventName))
            holder.tvEventName.setText(eventName);
        else
            holder.tvEventName.setText("-");

        if (!TextUtils.isEmpty(eventDate))
            holder.tvEventDate.setText(eventDate);
        else
            holder.tvEventDate.setText("-");

        holder.itemView.setOnClickListener(view -> {
            Intent viewEvent = new Intent(context, ViewEventActivity.class);
            viewEvent.putExtra("event", event);
            context.startActivity(viewEvent);
        });

    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{

        ImageView ivEventBanner;
        TextView tvEventName, tvEventDate;
        View itemView;

        public EventViewHolder(View itemView) {
            super(itemView);

            this.itemView = itemView;
            ivEventBanner = itemView.findViewById(R.id.imageView_eventBanner_item);
            tvEventName = itemView.findViewById(R.id.textView_eventName_item);
            tvEventDate = itemView.findViewById(R.id.textView_eventDate_item);
        }
    }
}
