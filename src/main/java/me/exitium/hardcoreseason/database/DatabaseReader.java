package me.exitium.hardcoreseason.database;

import me.exitium.hardcoreseason.HardcoreSeason;
import me.exitium.hardcoreseason.Utils;
import me.exitium.hardcoreseason.player.HCPlayer;
import me.exitium.hardcoreseason.statistics.StatisticsHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public record DatabaseReader(HardcoreSeason plugin) {

    public boolean hcPlayerExists(UUID uuid) {
        try (Connection connection = plugin.getSqlConnection(); PreparedStatement ps = connection.prepareStatement(
                "SELECT * FROM hardcore_players WHERE uuid=? AND season_number=?")) {
            ps.setObject(1, Utils.asBytes(uuid));
            ps.setInt(2, plugin.getSeasonNumber());

            ResultSet result = ps.executeQuery();
            return result.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public HCPlayer getPlayer(UUID uuid, int seasonNumber) {
        try (Connection connection = plugin.getSqlConnection(); PreparedStatement ps = connection.prepareStatement(
                "SELECT * FROM hardcore_players WHERE uuid=? AND season_number=? LIMIT 1")) {
            ps.setObject(1, Utils.asBytes(uuid));
            ps.setInt(2, seasonNumber);

            ResultSet result = ps.executeQuery();

            if (result.next()) {
                return new HCPlayer(
                        uuid,
                        result.getString("player_name"),
                        HCPlayer.STATUS.values()[result.getInt("status")],
                        new StatisticsHandler(
                                Utils.jsonToMap(result.getString("monster_kills")),
                                Utils.jsonToMap(result.getString("potions_used")),
                                Utils.jsonToMap(result.getString("food_eaten")),
                                Utils.jsonToMap(result.getString("damage_taken")),
                                Utils.jsonToMap(result.getString("damage_dealt")),
                                Utils.jsonToMap(result.getString("items_crafted")),
                                Utils.jsonToMap(result.getString("eyes_used")),
                                Utils.jsonToMap(result.getString("trades_made"))),
                        result.getString("spawn_point"),
                        result.getInt("time"),
                        result.getString("return_location")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HCPlayer> getAllPlayers(int seasonNumber) {
        try (Connection connection = plugin.getSqlConnection(); PreparedStatement ps = connection.prepareStatement(
                "SELECT * FROM hardcore_players WHERE season_number=?")) {
            ps.setInt(1, seasonNumber);

            ResultSet results = ps.executeQuery();

            List<HCPlayer> playerList = new ArrayList<>();
            while (results.next()) {
                playerList.add(new HCPlayer(
                        Utils.asUuid(results.getBytes("uuid")),
                        results.getString("player_name"),
                        HCPlayer.STATUS.values()[results.getInt("status")],
                        results.getLong("time"))
                );
            }
            return playerList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
