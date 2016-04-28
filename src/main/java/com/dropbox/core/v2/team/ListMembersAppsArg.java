/* DO NOT EDIT */
/* This file was generated from team_linked_apps.babel */

package com.dropbox.core.v2.team;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonUtil;
import com.dropbox.core.json.StructJsonDeserializer;
import com.dropbox.core.json.StructJsonSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

/**
 * Arguments for {@link DbxTeamTeamRequests#linkedAppsListMembersLinkedApps()}.
 */
@JsonSerialize(using=ListMembersAppsArg.Serializer.class)
@JsonDeserialize(using=ListMembersAppsArg.Deserializer.class)
class ListMembersAppsArg {
    // struct ListMembersAppsArg

    // ProGuard work-around since we declare serializers in annotation
    static final Serializer SERIALIZER = new Serializer();
    static final Deserializer DESERIALIZER = new Deserializer();

    protected final String cursor;

    /**
     * Arguments for {@link
     * DbxTeamTeamRequests#linkedAppsListMembersLinkedApps()}.
     *
     * @param cursor  At the first call to the {@link
     *     DbxTeamTeamRequests#linkedAppsListMembersLinkedApps()} the cursor
     *     shouldn't be passed. Then, if the result of the call includes a
     *     cursor, the following requests should include the received cursors in
     *     order to receive the next sub list of the team applications.
     */
    public ListMembersAppsArg(String cursor) {
        this.cursor = cursor;
    }

    /**
     * Arguments for {@link
     * DbxTeamTeamRequests#linkedAppsListMembersLinkedApps()}.
     *
     * <p> The default values for unset fields will be used. </p>
     */
    public ListMembersAppsArg() {
        this(null);
    }

    /**
     * At the first call to the {@link
     * DbxTeamTeamRequests#linkedAppsListMembersLinkedApps()} the cursor
     * shouldn't be passed. Then, if the result of the call includes a cursor,
     * the following requests should include the received cursors in order to
     * receive the next sub list of the team applications
     *
     * @return value for this field, or {@code null} if not present.
     */
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            cursor
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            ListMembersAppsArg other = (ListMembersAppsArg) obj;
            return (this.cursor == other.cursor) || (this.cursor != null && this.cursor.equals(other.cursor));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return serialize(false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return serialize(true);
    }

    private String serialize(boolean longForm) {
        try {
            return JsonUtil.getMapper(longForm).writeValueAsString(this);
        }
        catch (JsonProcessingException ex) {
            throw new RuntimeException("Failed to serialize object", ex);
        }
    }

    static final class Serializer extends StructJsonSerializer<ListMembersAppsArg> {
        private static final long serialVersionUID = 0L;

        public Serializer() {
            super(ListMembersAppsArg.class);
        }

        public Serializer(boolean unwrapping) {
            super(ListMembersAppsArg.class, unwrapping);
        }

        @Override
        protected JsonSerializer<ListMembersAppsArg> asUnwrapping() {
            return new Serializer(true);
        }

        @Override
        protected void serializeFields(ListMembersAppsArg value, JsonGenerator g, SerializerProvider provider) throws IOException, JsonProcessingException {
            if (value.cursor != null) {
                g.writeObjectField("cursor", value.cursor);
            }
        }
    }

    static final class Deserializer extends StructJsonDeserializer<ListMembersAppsArg> {
        private static final long serialVersionUID = 0L;

        public Deserializer() {
            super(ListMembersAppsArg.class);
        }

        public Deserializer(boolean unwrapping) {
            super(ListMembersAppsArg.class, unwrapping);
        }

        @Override
        protected JsonDeserializer<ListMembersAppsArg> asUnwrapping() {
            return new Deserializer(true);
        }

        @Override
        public ListMembersAppsArg deserializeFields(JsonParser _p, DeserializationContext _ctx) throws IOException, JsonParseException {

            String cursor = null;

            while (_p.getCurrentToken() == JsonToken.FIELD_NAME) {
                String _field = _p.getCurrentName();
                _p.nextToken();
                if ("cursor".equals(_field)) {
                    cursor = getStringValue(_p);
                    _p.nextToken();
                }
                else {
                    skipValue(_p);
                }
            }


            return new ListMembersAppsArg(cursor);
        }
    }
}
