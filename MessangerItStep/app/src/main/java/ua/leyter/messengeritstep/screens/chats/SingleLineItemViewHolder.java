package ua.leyter.messengeritstep.screens.chats;

/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ua.leyter.messengeritstep.R;

/** A simple single line list item. */
public class SingleLineItemViewHolder extends ViewHolder {

    public final ImageView image;
    public final TextView firstLine;

    public SingleLineItemViewHolder(@NonNull View view) {
        super(view);
        this.image = itemView.findViewById(R.id.userImage);
        this.firstLine = itemView.findViewById(R.id.userName);
    }

    @NonNull
    public static SingleLineItemViewHolder create(@NonNull ViewGroup parent) {
        return new SingleLineItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.material_list_item_single_line, parent, false));
    }
}
