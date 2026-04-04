package com.example.shop.member;


import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Void> createMember(@RequestBody MemberCreateRequest request) {
        Long memberID = memberService.createMember(request);
        return ResponseEntity.created(URI.create("/members/" + memberID)).build();
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        // Service 계층에서 회원 목록을 가져온다
        List<Member> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }

    @GetMapping("/{memberID}")
    public ResponseEntity<Member> getMember(@PathVariable Long memberID) {
        Member member = memberService.getMemberByID(memberID);
        return ResponseEntity.ok(member);
    }

    @PatchMapping("/{memberID}")
    public ResponseEntity<Void> updateMember(@PathVariable Long memberID, @RequestBody MemberUpdateRequest request) {
        memberService.updateMember(memberID, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{memberID}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long memberID) {
        memberService.deleteMember(memberID);
        return ResponseEntity.noContent().build(); // 204 no content
    }


    
}








