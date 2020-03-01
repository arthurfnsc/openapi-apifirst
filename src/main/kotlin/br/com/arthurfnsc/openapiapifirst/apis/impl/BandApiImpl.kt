package br.com.arthurfnsc.openapiapifirst.apis.impl

import org.openapi.band.server.api.V1Api
import org.openapi.band.server.model.Band
import org.openapi.band.server.model.PatchDocument
import org.openapi.band.server.model.RequestPostBand
import org.openapi.band.server.model.RequestPostBandMember
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class BandApiImpl : V1Api {

    override fun createBand(requestPostBand: RequestPostBand?): ResponseEntity<Band> {
        return super.createBand(requestPostBand)
    }

    override fun createBandMember(bandId: UUID?, requestPostBandMember: RequestPostBandMember?): ResponseEntity<Band> {
        return super.createBandMember(bandId, requestPostBandMember)
    }

    override fun deleteBand(bandId: UUID?): ResponseEntity<Void> {
        return super.deleteBand(bandId)
    }

    override fun deleteBandMember(bandId: UUID?, memberId: UUID?): ResponseEntity<Band> {
        return super.deleteBandMember(bandId, memberId)
    }

    override fun retrieveBands(): ResponseEntity<MutableList<Band>> {
        return super.retrieveBands()
    }

    override fun updateBand(bandId: UUID?, patchDocument: MutableList<PatchDocument>?): ResponseEntity<Band> {
        return super.updateBand(bandId, patchDocument)
    }
}
