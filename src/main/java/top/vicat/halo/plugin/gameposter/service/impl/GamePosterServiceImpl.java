package top.vicat.halo.plugin.gameposter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import top.vicat.halo.plugin.gameposter.entity.UserBaseProfile;
import top.vicat.halo.plugin.gameposter.platforms.PlatformManager;
import top.vicat.halo.plugin.gameposter.service.IGamePosterService;

@Component
@RequiredArgsConstructor
public class GamePosterServiceImpl implements IGamePosterService {

    private final PlatformManager manager;

    @Override
    public Mono<UserBaseProfile.UserBaseProfileSpec> getUserBaseProfiles(String accountId) {
        return manager.getProfileByAccountId(accountId, "STEAM");
    }
}
