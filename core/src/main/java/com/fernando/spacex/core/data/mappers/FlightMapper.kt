package com.fernando.spacex.core.data.mappers

import com.fernando.spacex.core.data.models.*
import com.fernando.spacex.core.domain.entities.*
import com.fernando.spacex.core.presentation.models.*


internal fun FlightDto.toEntity() = FlightEntity(
    crew = crew,
    details = details,
    flightNumber = flightNumber,
    isTentative = isTentative,
    lastDateUpdate = lastDateUpdate,
    lastLlLaunchDate = lastLlLaunchDate,
    lastLlUpdate = lastLlUpdate,
    lastWikiLaunchDate = lastWikiLaunchDate,
    lastWikiRevision = lastWikiRevision,
    lastWikiUpdate = lastWikiUpdate,
    launchDateLocal = launchDateLocal,
    launchDateSource = launchDateSource,
    launchDateUnix = launchDateUnix,
    launchDateUtc = launchDateUtc,
    // launchFailureDetails = launchFailureDetails?.toEntity(),
    launchSite = launchSite?.toEntity(),
    launchSuccess = launchSuccess,
    launchWindow = launchWindow,
    launchyear = launchyear,
    links = links?.toEntity(),
    missionId = missionId,
    missionName = missionName,
    rocket = rocket?.toEntity(),
    ships = ships,
    staticFireDateUnix = staticFireDateUnix,
    staticFireDateUtc = staticFireDateUtc,
    tbd = tbd,
    telemetry = telemetry?.toEntity(),
    tentativeMaxPrecision = tentativeMaxPrecision,
    upcoming = upcoming

)


internal fun CoreDto.toEntity() = CoreEntity(
    block = block,
    core_serial = core_serial,
    flight = flight,
    gridFins = gridFins,
    landSuccess = landSuccess,
    landingIntent = landingIntent,
    landingType = landingType,
    landingVehicle = landingVehicle,
    legs = legs,
    reused = reused
)

internal fun FairingsDto.toEntity() = FairingsEntity(
    recovered = recovered,
    recoveryAttempt = recoveryAttempt,
    reused = reused,
    ship = ship
)

internal fun FirstStageDto.toEntity() = FirstStageEntity(
    cores = cores?.map { it.toEntity() }
)

internal fun LaunchFailureDetailsDto.toEntity() = LaunchFailureDetailsEntity(
    altitude = altitude,
    reason = reason,
    time = time
)

internal fun LaunchSiteDto.toEntity() = LaunchSiteEntity(
    siteId = siteId,
    siteName = siteName,
    siteNameLong = siteNameLong
)

internal fun LinksDto.toEntity() = LinksEntity(
    articleLink = articleLink,
    flickrImages = flickrImages,
    missionPatch = missionPatch,
    missionPatchSmall = missionPatchSmall,
    presSkit = presSkit,
    redditCampaign = redditCampaign,
    redditLaunch = redditLaunch,
    redditMedia = redditMedia,
    redditRecovery = redditRecovery,
    videoLink = videoLink,
    wikipedia = wikipedia,
    youtubeId = youtubeId
)

internal fun RocketDto.toEntity() = RocketEntity(
    fairings = fairings?.toEntity(),
    firstStage = firstStage?.toEntity(),
    rocketId = rocketId,
    rocketName = rocketName,
    rocketType = rocketType
)

internal fun TelemetryDto.toEntity() = TelemetryEntity(
    flightClub = flightClub
)


fun FlightEntity.toParcelable() = Flight(
    details = details,
    flightNumber = flightNumber,
    isTentative = isTentative,
    lastDateUpdate = lastDateUpdate,
    lastLlLaunchDate = lastLlLaunchDate,
    lastLlUpdate = lastLlUpdate,
    lastWikiLaunchDate = lastWikiLaunchDate,
    lastWikiRevision = lastWikiRevision,
    lastWikiUpdate = lastWikiUpdate,
    launchDateLocal = launchDateLocal,
    launchDateSource = launchDateSource,
    launchDateUnix = launchDateUnix,
    launchDateUtc = launchDateUtc,
    // launchFailureDetails = launchFailureDetails?.toEntity(),
    launchSite = launchSite?.toParcelable(),
    launchSuccess = launchSuccess,
    launchWindow = launchWindow,
    launchyear = launchyear,
    links = links?.toParcelable(),
    missionId = missionId,
    missionName = missionName,
    rocket = rocket?.toParcelable(),
    ships = ships,
    staticFireDateUnix = staticFireDateUnix,
    staticFireDateUtc = staticFireDateUtc,
    tbd = tbd,
    telemetry = telemetry?.toParcelable(),
    tentativeMaxPrecision = tentativeMaxPrecision,
    upcoming = upcoming

)

internal fun CoreEntity.toParcelable() = Core(
    block = block,
    core_serial = core_serial,
    flight = flight,
    gridFins = gridFins,
    landSuccess = landSuccess,
    landingIntent = landingIntent,
    landingType = landingType,
    landingVehicle = landingVehicle,
    legs = legs,
    reused = reused
)

internal fun FairingsEntity.toParcelable() = Fairings(
    recovered = recovered,
    recoveryAttempt = recoveryAttempt,
    reused = reused,
    ship = ship
)

internal fun FirstStageEntity.toParcelable() = FirstStage(
    cores = cores?.map { it.toParcelable() }
)

internal fun LaunchSiteEntity.toParcelable() = LaunchSite(
    siteId = siteId,
    siteName = siteName,
    siteNameLong = siteNameLong
)

internal fun LinksEntity.toParcelable() = Links(
    articleLink = articleLink,
    flickrImages = flickrImages,
    missionPatch = missionPatch,
    missionPatchSmall = missionPatchSmall,
    presSkit = presSkit,
    redditCampaign = redditCampaign,
    redditLaunch = redditLaunch,
    redditMedia = redditMedia,
    redditRecovery = redditRecovery,
    videoLink = videoLink,
    wikipedia = wikipedia,
    youtubeId = youtubeId
)

internal fun RocketEntity.toParcelable() = Rocket(
    fairings = fairings?.toParcelable(),
    firstStage = firstStage?.toParcelable(),
    rocketId = rocketId,
    rocketName = rocketName,
    rocketType = rocketType
)

internal fun TelemetryEntity.toParcelable() = Telemetry(
    flightClub = flightClub
)


